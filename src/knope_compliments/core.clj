(ns knope-compliments.core
  (:gen-class)
  (:require [clojure.string :as str]))

(defn get-lines [file]
  (str/split-lines (slurp file)))

(defn -main
  "Get Leslie Knope compliment"
  [& args]
  (println (str/join ", " [(first args) (rand-nth (get-lines "resources/compliments.txt"))])))
