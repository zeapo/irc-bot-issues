(ns irc-issues.core
  (:require
   [irclj.core :refer :all]
   [irclj.parser :refer :all])
  (:gen-class))

(def default-config
  {
   :server "irc.freenode.org"
   :port 6667
   :channel "#irc-issues-bot"
   :nick "batbotbit"
   })

(defn callback [irc args]
  "Called for each msg received"
  (let [{text :text
         target :target
         nick :nick
         host :host
         command :command} args]
    (println (str command "," text "," nick "," host))))

;; Connect to the IRC server and join the channel
(defn irc-bot
  "The main entry point for the IRC bot"
  [irc-config]
  (def irc (connect
            (:server irc-config)
            (:port irc-config)
            (:nick irc-config)
            :callbacks {:privmsg callback}))
  (join irc (:channel irc-config)))
        

(defn -main
  "Launches the bot"
  []
  (irc-bot default-config))
