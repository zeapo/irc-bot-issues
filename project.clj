(defproject irc-issues "0.0.1"
  :description "IRC bot that handle issues auto-magically"
  ;; :url "http://example.com/FIXME"
  :license {:name "Apache License v2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [irclj "0.5.0-alpha4"]]
  :main ^:skip-aot irc-issues.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
