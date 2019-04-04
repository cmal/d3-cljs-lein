(ns d3-cljs.array
  )

(defn min
  ([v]
   (apply min v))
  ([v f]
   (apply (partial min-key f) v)))
