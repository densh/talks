# Data as code and code as data
# in Scala

Denys Shabalin, LAMP/EPFL

---

# About me

* Born in Ukraine
* Implemented [quasiquotes for 2.11]()
* Co-authored [scala.meta]() (with Eugene Burmako)
* Created [scala-offheap]()

---

# Today

1. Where does the idea comes from?
1. What about Scala?
1. How do I use it?
1. Why do people do it?

---

# Not about

* Macros
* Reflection
* Language design

---

# Not about

<img src="res/native.png" height="450" width="450"/>

---

# 1. The origin

---

<img src="res/lisp.png" height="450" width="600"/>

<p style="color: grey;font-size:14pt;">
(Image by Conrad Barski, M.D.)
</p>

---

# S-expressions

* Atoms:
    * Numbers: 1, 2.0, 42/3
    * Strings: "Hello, world!
    * Symbols: lambda, +, -, =
    * ...
* Lists: (a b c)

---

# Data as code

TODO

---

# Racket

Code is expressed through s-expressions:

```
> (define factorial
    (lambda (n)
      (if (= n 0)
          1
          (* n (factorial (- n 1))))))

> (factorial 42)
1405006117752879898543142606244511569936384000000000
```

---

# Quasiquotes

```
> (quasiquote (factorial 42))
'(factorial 42)

> (let
    ([fact42 '(factorial 42)])
    (eval fact42))
1405006117752879898543142606244511569936384000000000


> TODO: unquote

```

---

# 2. What about Scala?

```
object Factorial extends App {
  def factorial(n: Int) =
    if (n == 0) 1
    else n * factorial(n - 1)

  println(factorial(42))
}

---

# 3. How?

---

# 4. Why?

---

## 4.1 Code generation

---

## 4.2 Code transformations

---

## 4.3 Code analysis

---

# Summary

---

# Questions?
