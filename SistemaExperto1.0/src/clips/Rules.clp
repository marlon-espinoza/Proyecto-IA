(deftemplate clima
    (slot tipo-clima)
)
(deftemplate lugares
    (slot lugares-interes)
)
(deftemplate actividades
    (slot tipo-actividades)
)
(defclass motorcontroller controlador.Recomendaciones)
(ppdeftemplate motorcontroller)

(defglobal ?*mc* = (new controlador.Recomendaciones))
(definstance motorcontroller ?*mc* static)
(reset)

(defrule r1
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "centros comerciales"))  
    =>
    (printout t "Guayaquil" crlf)    
)

(defrule r2
	(clima (tipo-clima "templado")) (actividades(tipo-actividades "buceo"))
    =>
    (printout t "Galapagos" crlf)    
)

(defrule r3
	(clima (tipo-clima "frío")) (lugares(lugares-interes "sitios historicos"))
    =>
    (printout t "Quito: Museo Nacional" crlf)    
)

(defrule r4
	(clima (tipo-clima "frío")) (or(lugares(lugares-interes "flora y fauna")) (lugares(lugares-interes "zoológicos")))
    =>
    (printout t "Quito:Fundacion Los Monos Selva y Vida" crlf)    
)
	
(defrule r5
	(clima (tipo-clima "húmedo")) (actividades(tipo-actividades "tours"))
    =>
    (printout t "Ibarra:Laguna Cuicocha" crlf)    
)

(defrule r6
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "playas"))
    =>
    (printout t "Manabí: Playa los Frailes" crlf)    
)

(defrule r7
	(clima (tipo-clima "cálido")) (actividades(tipo-actividades "vida nocturna"))
    =>
    (printout t "Santa Elena: Playa Montañita" crlf)    
)

(defrule r8
	(clima (tipo-clima "cálido")) (actividades (tipo-actividades "surf"))
    =>
    (printout t "Esmeradas: Playa Mompiche" crlf)    
)

(defrule r9
	(clima (tipo-clima "frío")) (actividades (tipo-actividades "flora y fauna"))
    =>
    (printout t "Imbabura: Cotacachi" crlf)    
)

(defrule r10
	(clima (tipo-clima "frío")) (lugares(lugares-interes "monumentos"))
    =>
    (printout t "Imbabura: Contacachi" crlf)    
)

(defrule r11
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "monumentos"))
    =>
    (printout t "Quito: Plaza Foch" crlf)    
)

(defrule r12
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "playa")) (actividades(tipo-actividades "tours"))
    =>
    (printout t "Manabí: Puerto López" crlf)    
)

(defrule r13
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "playa")) (actividades(tipo-actividades "surf"))
    =>
    (printout t "Salinas: Chocolatera" crlf)    
)

(defrule r14
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "flora y fauna")) (actividades(tipo-actividades "ciclismo"))
    =>
    (printout t "Baños: Ruta de las cascadas" crlf)    
)

(defrule r15
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "flora y fauna")) (actividades(tipo-actividades "ciclismo"))
    =>
    (printout t "Baños: Ruta de las cascadas" crlf)    
)

(defrule r16
	(clima (tipo-clima "frío")) (or(actividades(tipo-actividades "kayak")) (actividades(tipo-actividades "parapente")))
    =>
    (printout t "Ambato: MTS Adventure " crlf)    
)
(defrule r17
	(clima (tipo-clima "frío")) (actividades(tipo-actividades "Tours")) 
    =>
    (printout t "Chimborazo: La Nariz del Diablo" crlf)    
)


(defrule r18
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "parques nacionales")) (actividades(tipo-actividades "tours"))
    =>
    (printout t "Galapagos: Ruta de las cascadas" crlf)    
)

(defrule r19
	(clima (tipo-clima "frío")) (lugares(lugares-interes "museos")) (actividades(tipo-actividades "tour"))
    =>
    (printout t "Quito: Museo Mindalae" crlf)    
)

(defrule r20
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "playas")) (or(actividades(tipo-actividades "buceo"))(actividades(tipo-actividades "tours")))
    =>
    (printout t "Manabí: Puerto López" crlf)    
)

(defrule r21
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "museos")) (actividades(tipo-actividades "tour"))
    =>
    (printout t "Guayaquil: Museo Miniatura Guayaquil" crlf)    
)

(defrule r22
	(clima (tipo-clima "frío")) (lugares(lugares-interes "museos")) (actividades(tipo-actividades "tour"))
    =>
    (printout t "Santo Domingo: Museo Casa de Sucre" crlf)    
)

(defrule r23
	(clima (tipo-clima "frío")) (lugares(lugares-interes "parques urbanos")) (or(actividades(tipo-actividades "montañismo")) (actividades(tipo-actividades "diversión y juegos")))
    =>
    (printout t "Quito: Teleferico" crlf)    
)

(defrule r24
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "zoológicos")) (actividades(tipo-actividades "montañismo"))
    =>
    (printout t "Guayaquil: El pantanal" crlf)    
)

(defrule r25
	(clima (tipo-clima "húmedo")) (lugares(lugares-interes "zoológicos")) (actividades(tipo-actividades "montañismo"))
    =>
    (printout t "Tena: Amazoonico Animal Rescue Centre" crlf)    
)


(defrule r26
	(clima (tipo-clima "frío")) (lugares(lugares-interes "zoológicos")) (actividades(tipo-actividades "montañismo"))
    =>
    (printout t "Cuenca: Amaru Zoológico" crlf)    
)

(defrule r27
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "parques urbanos")) (actividades(tipo-actividades "montañismo"))
    =>
    (printout t "Guayaquil: Parque de las Iguanas" crlf)    
)

(defrule r28
	(clima (tipo-clima "frío")) (lugares(lugares-interes "flora y fauna")) (or(actividades(tipo-actividades "tours"))(actividades(tipo-actividades "montañismo"))) 
    =>
    (printout t "Ambato: Casa Del Arbol" crlf)    
)


(defrule r29
	(clima (tipo-clima "frío")) (lugares(lugares-interes "centro comerciales")) (actividades(tipo-actividades "relajación"))
    =>
    (printout t "Quito: Cascada Spa Ecuador" crlf)    
)

(defrule r30
	(clima (tipo-clima "frío")) (lugares(lugares-interes "zoológicos")) (actividades(tipo-actividades "montañismo"))
    =>
    (printout t "Cuenca: Amaru Zoológico" crlf)    
)

(defrule r31
	(clima (tipo-clima "frío")) (or(lugares(lugares-interes "sitios tradicionales")) (lugares(lugares-interes "lugares religiosos")))
    =>
    (printout t "Quito: Catedral de Quito" crlf)    
)


(defrule r32
	(clima (tipo-clima "frío")) (or(lugares(lugares-interes "museos"))(lugares(lugares-interes "sitios tradicionales"))) (actividades(tipo-actividades "tours"))
    =>
    (printout t "Quito: Mitad del mundo" crlf)    
)

(defrule r33
	(clima (tipo-clima "frío")) (lugares(lugares-interes "sitios tradicionales")) (actividades(tipo-actividades "tour"))
    =>
    (printout t "Cañar: Ruinas Ingapirca " crlf)    
)

(defrule r34
	(clima (tipo-clima "frío")) (lugares(lugares-interes "parque nacionales")) (actividades(tipo-actividades "kayak"))
    =>
    (printout t "Cotopaxi: Laguna Quilotoa" crlf)    
)
(run)

