(defproject tools.trace "0.7.9-SNAPSHOT"
  :description "A Clojure tracing facility in Clojure"
  :parent [org.clojure/pom.contrib "0.1.2"]
  :url "https://github.com/clojure/tools.trace"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]
  :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :profiles {:1.2 {:dependencies [[org.clojure/clojure "1.2.0"]]}
             :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}}
  :aliases {"test-all" ["with-profile" "test,1.2:test,1.3:test,1.4:test,1.5:test,1.6:test,1.7:test:test,1.8:test,1.9" "test"]
            "check-all" ["with-profile" "1.2:1.3:1.4:1.5:1.6:1.7:1.8:1.9" "check"]}
  :min-lein-version "2.5.0")  
 
