(ns react-bootstrap-typeahead-minimal.views
  (:require [re-frame.core :as re-frame]
            [react-bootstrap-typeahead-minimal.subs :as subs]
            [react-bootstrap-typeahead]
            ))

(defn main-panel []
  (console.log "DEBUG" react-bootstrap-typeahead)
  (let [name (re-frame/subscribe [::subs/name])]
    [:div "Hello from " @name]))
