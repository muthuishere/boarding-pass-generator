(ns boarding-pass-generator.core
  (:use [ring.adapter.jetty]
        [org.httpkit.server]
        [compojure.core :refer :all]
        [compojure.handler :as handler]
        [compojure.route :as route])(:gen-class))



(defroutes app-routes
           (GET "/" [] "Show something")
           (GET "/show" [] "what are you expecting")
           (POST "/" [] "Create something")
           (PUT "/" [] "Replace something")
           (PATCH "/" [] "Modify Something")
           (DELETE "/" [] "Annihilate something")
           (OPTIONS "/" [] "Appease something")
           (HEAD "/" [] "Preview something"))

;
;(defn app [req]
;  {:status  200
;   :headers {"Content-Type" "text/html"}
;   :body    "hello HTTP!"})

(def handler
  (handler/site app-routes))


(run-server handler {:port 3000})

;
;(defn handler
;      [request]
;      {:status 200 :body "Send Boarding pass"})
;

;(run-jetty handler {:port 3000})