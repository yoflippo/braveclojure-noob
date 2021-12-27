(ns braveclojure-noob.core
  (:gen-class))
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World! neeeee"))
(if true
  "By zeus"
  "ja hoor")
(if true
  (do (println "By odins Elbow")
      "nog iets"))

;;;; en do gebruik je voor het stringen van meerdere commandos
(if true
  (do (println "Success!")
      (println "By Zeus's hammer!")
      "Schrauwen")
  (do (println "Failure!")
      "By Aquaman's trident!"))

;;;; Korte versie van alleen en if met meerdere 'forms'
(nil? nil)
(nil? true)
(if "trueString"
  "een string om te controleren")
(if nil
  "een string om te controleren"
  "een nil is falsey")
(= 1 1)
(= nil nil)
(= 1 2)
(or true true)
(or false nil nil :ja :nee)
(or false true)
(and true true)
(and false true)
(and :free_bla :blaaaat)
(and :feelinggood nil false)

; Binding a name to a value (NOT ASSIGNING)
failed-prot
93
1.2
1/5
(* 1/5 2/4)


; Strings
"Lord Voldemore"
"\"He who must not be name\""
(def namex "Chewbacca")
(str "\"gezeik zeg\" - " namex)

;;;; Maps
;; Sorted Maps
;; Hash Maps
{:keyword1 "charlie"
 :keyword2 "lastname"}
{"string-key" +}

;nesting of MAPS 
{:name {:first "john" :middle "jacob" :last "jingleheidmdersc"}}
(hash-map :a 1 :b 2)
(get {:a 5 :b 4} :b)
(get {:a 0 :b {:c "humhum"}} :b)
(get {:a 5 :b 4} :c)
(get {:a 5 :b 4} :a "default value")
(get {:a 5 :b 4} :d "default value")


; DEF is a best seen as a CONST
(def listms {:a 5 :b 4})
(def listinlistms {:a 5 :b {:c "ho hum"}})
listinlistms
(get-in listinlistms [:b :c])


;threat map as a function
({:name "the hman coffeept"} :name)
(:name {:name "the hman coffeept"})
(:name {:name "the hman coffeept" :ohtername "lala"} "again default value")


;;;; vectors
[3 2 1]
(get [3 2 1] 1)
; read a map from a vector
(get ["a" {:name "pugsley"} "c"] 1)


; create vectors with the vecotr function
(vector "creepy" "full" "moon")
(conj [1 2 3] "addedelement")


;;;;;lists
`(1 2 3 4 5)
(nth `(:a :b :c) 0)
(nth `(:a :b :c) 2)
(list 1 "two" {3 4})


;; When to use a LIST or a VECTOR: use vector when there is need to easily add elements
;;; Otherwise use vector


;;;; SETS
;;; hash sets: only unique elements
;;; sorted set
#{"stringinset" 20 :lalal}
(hash-set 11 2 22 33 44 33 44 11 2 22)
(conj #{:a :b :c} :b)


;make SET from VECTOR
(set [1 2 3 4 4 5 3])
(set [3 3 3 4 4])
(contains? #{:a :b :c} :a)
(contains? #{:a :b :c} :d)
(contains? #{nil} nil)
(#{:a :b :c} :a)
(:a #{:a :b :c})
(#{:a :b :c} :d)
(get #{:a :b} :a)
;; a SET containing nil, will also return nil
(get #{nil :a :b} nil)


;;;;;;;;;;;; FUNCTIONS
;;;; A function that returns a function
(or + -)
((or + -) 1 2 3) ;return the sum
((and (= 1 1) +) 1 2 3)
((first [+ 0]) 1 2 3)
(1 2 3 4 5) ;numbers an string are no functions
("one" 1 2 3 4 5) ;numbers an string are no functions

;; higer-order function take functions as arguments
(inc 1.1)

; map (A FUNCTION, not a datastructure) applies a function to each member
(map inc [0 1 2 3 4])
(map inc #{0 1 2 3 4])


