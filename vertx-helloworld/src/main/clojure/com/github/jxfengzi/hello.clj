(ns com.github.jxfengzi.hello
  (:gen-class
    :name com.github.jxfengzi.hello.MainTest))

(defn helloworld [username]
  (println (format "Hello, %s" username)))

(defn -main [& args]
  (helloworld "ouyang"))