#API for trace (master branch)
by Stuart Sierra, Michel Salim, Luc Préfontaine, Jonathan Fischer Friberg

# Compatibility

The trace tool is compatible with Clojure versions 1.2.x and 1.3.

#Usage:

(ns your-namespace
  (:require clojure.contrib.trace))

#Overview

This file defines simple "tracing" macros to help you see what your
code is doing.


#Public Variables and Functions

##*trace-depth*
var

Current stack depth of traced function calls.


##deftrace
macro

Usage: (deftrace name & definition)

Use in place of defn; traces each call/return of this fn, including
arguments.  Nested calls to deftrace'd functions will print a
tree-like structure.


##dotrace
macro

Usage: (dotrace fnames & exprs)

Given a sequence of function identifiers, evaluate the body
expressions in an environment in which the identifiers are bound to
the traced functions.  Does not work on inlined functions,
such as clojure.core/+


##trace
function

Usage: (trace value)
       (trace name value)

Sends name (optional) and value to the tracer function, then
returns value.  May be wrapped around any expression without
affecting the result.


##trace-fn-call
function

Usage: (trace-fn-call name f args)

Traces a single call to a function f with args.  'name' is the
symbol name of the function.

##trace-indent
function

Usage: (trace-indent)

Returns an indentation string based on *trace-depth*


##tracer
function

Usage: (tracer name value)

This function is called by trace.  Prints to standard output, but
may be rebound to do anything you like.  'name' is optional.

##traceforms
macro

Usage: (traceforms & body)

This macro helps identifying which nested form triggered a runtime Exception.
However it will not catch compilation exceptions.