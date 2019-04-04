(defproject d3-cljs "0.1.0-SNAPSHOT"
  :description "A d3.js inspired library for data visualization calculation in ClojureScript"
  :url "https://github.com/d3-cljs"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.946" :scope "provided"]]

  :plugins
  [[lein-cljsbuild "1.1.7"]]

  :profiles
  {:dev {:source-paths ["dev/" "src/"]
         :dependencies
         [[com.cemerick/piggieback "0.2.2"]
          [org.clojure/tools.nrepl "0.2.10"]]
         :repl-options
         {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}}

  :aliases
  {"run-tests" ["do" "clean," "cljsbuild" "once" "test"]
   "test-once" ["do" "clean," "cljsbuild" "once" "test"]
   "auto-test" ["do" "clean," "cljsbuild" "auto" "test"]}

  ;; :cljsbuild
  ;; {:builds [{:id "test"
  ;;            :source-paths ["src/" "test/"]
  ;;            :notify-command ["phantomjs" :cljs.test/runner "target/js/test.js"]
  ;;            :compiler {:output-to "target/js/test.js"
  ;;                       :optimizations :whitespace
  ;;                       :pretty-print true}
  ;;            {:id "example-01"
  ;;             :source-paths ["src/" "examples/"]
  ;;             :compiler {:output-to "examples/example-01/example.js"
  ;;                        :optimizations :whitespace
  ;;                        :pretty-print true}}}]}

 :main ^:skip-aot d3-cljs.core
;;  :target-path "target/%s"
;;  :profiles {:uberjar {:aot :all}}
  )
