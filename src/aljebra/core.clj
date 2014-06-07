(ns aljebra.core
  (:require [clojure.math.numeric-tower :as math]))

(def pi Math/PI)

(defn midpoint
  [p1 p2]
  (let [[x1 y1] p1
        [x2 y2] p2]
    [(/ (+ x1 x2) 2)
     (/ (+ y1 y2) 2)]))

(defn distance
  [p1 p2]
  (let [[x1 y1] p1
        [x2 y2] p2]
    (math/sqrt
     (+ (math/expt (- x2 x1) 2)
        (math/expt (- y2 y1) 2)))))

(defn percent-change
  [v1 v2]
  (* (/ (- v2 v1) v1) 100))

(defn circumference [r]
  (* 2 pi r))

(defn discriminate [a b c]
  (- (math/expt b 2) (* 4 a c)))

(defn solve-quadratic [a b c]
  (/ (- (- b)
        (math/sqrt (discriminate a b c)))
     (* 2 a)))

(midpoint [4 2] [3 3])

(distance [-2 -3] [-4 4])

(percent-change 1 1.5)

(circumference 9)

(discriminate 1 4 1)

(solve-quadratic 1 4 0)
