(def counter (r/atom 0))

(defn counter-component []
      [:div.h-screen.flex.items-center.justify-center
       [:div
        [:div.text-lg "value: " @counter ]
        [:input.block.bg-yellow-100.hover:bg-yellow-50.px-3.py-2.rounded.cursor-pointer
         {:type     "button" :value "Click me!"
          :on-click #(swap! counter inc)}]]])

[counter-component]
