(defproject buddy/buddy-sign "0.3.0"
  :description "Security library for Clojure"
  :url "https://github.com/funcool/buddy-sign"
  :license {:name "BSD (2-Clause)"
            :url "http://opensource.org/licenses/BSD-2-Clause"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.taoensso/nippy "2.7.1"]
                 [buddy/buddy-core "0.3.0"]
                 [cats "0.2.0"]
                 [clj-time "0.9.0"]
                 [cheshire "5.4.0"]]
  :source-paths ["src/clojure"]
  :javac-options ["-target" "1.7" "-source" "1.7" "-Xlint:-options"]
  :test-paths ["test"]
  :profiles {:speclj {:dependencies [[speclj "3.1.0"]]
                      :test-paths ["spec"]
                      :plugins [[speclj "3.1.0"]]}})