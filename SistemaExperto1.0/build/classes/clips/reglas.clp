(deftemplate preferencia-clima
	(slot clima)
)
(defclass motorcontroller controlador.Recomendaciones)
(ppdeftemplate motorcontroller)

(defglobal ?*mc* = (new controlador.Recomendaciones))
(definstance motorcontroller ?*mc* static)

(defrule r1
    (preferencia-clima (clima "frío"))
    =>
    (printout t "Lugar es: Cuenca" crlf)
    (call ?*mc* addRecomendacion "Cuenca")
)
(defrule r2
    (preferencia-clima (clima "cálido"))
    =>
    (printout t "Lugar es: Guayaquil" crlf)
    (call ?*mc* addRecomendacion "Guayaquil")
)
(defrule r3
    (preferencia-clima (clima "cálido"))
    (preferencia-clima (clima "húmedo"))
    =>
    (printout t "Lugar es: Amazonía" crlf)
    (call ?*mc* addRecomendacion "Amazonía")
)

