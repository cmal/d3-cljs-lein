(ns d3-cljs.array-test
  (:require [cljs.test :refer :all]
            [d3-cljs.array :refer :all]))

(deftest amin-test
  (testing "test min in array")
  (is (= 4 (min [5 4 6])))
  (is (= 4 (min [nil 5 4 6])))
  (is (= 4 (min [nil 5 4 6] identity)))
  (is (= 4 (min [nil 6 5 4] dec))))
