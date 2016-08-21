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
    (call ?*mc* addRecomendacion "San Marino")
    (call ?*mc* addRecomendacion "Mall Del Sol")
)

(defrule r2
	(actividades(tipo-actividades "buceo"))
    =>
    (call ?*mc* addRecomendacion "Galapagos Beach at Tortuga Bay")
    (call ?*mc* addRecomendacion "Dive Center Silberstein")
    (call ?*mc* addRecomendacion "Eagleray Tours")
)

(defrule r3
	(clima (tipo-clima "frío")) (lugares(lugares-interes "sitios tradicionales"))
    =>
    (call ?*mc* addRecomendacion "Museo Nacional Quito")    
)

(defrule r4
	(clima (tipo-clima "frío")) (or(lugares(lugares-interes "flora y fauna")) (lugares(lugares-interes "zoológicos")))
    =>
    (call ?*mc* addRecomendacion "Fundacion Los Monos Selva y Vida")
)
	
(defrule r5
	(clima (tipo-clima "frío")) (actividades(tipo-actividades "tours"))
    =>
    (call ?*mc* addRecomendacion "Laguna Cuicocha")
    (call ?*mc* addRecomendacion "Laguna Quilotoa")
    (call ?*mc* addRecomendacion "Cotacachi")
)

(defrule r6
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "playas"))
    =>
    (call ?*mc* addRecomendacion "Playa los Frailes")
    (call ?*mc* addRecomendacion "Playa de Chipipe")
)

(defrule r7
	(clima (tipo-clima "cálido"))(lugares(lugares-interes "playas"))(actividades(tipo-actividades "vida nocturna"))
    =>
    (call ?*mc* addRecomendacion "Montanita")
)

(defrule r8
	(clima (tipo-clima "cálido")) (or(actividades (tipo-actividades "surf")) (lugares(lugares-interes "playas")))
    =>
    (call ?*mc* addRecomendacion "Mompiche")
    (call ?*mc* addRecomendacion "Ocean Freaks")
)

(defrule r9
	(clima (tipo-clima "frío")) (or(actividades (tipo-actividades "flora y fauna"))(actividades (tipo-actividades "cliclismo")))
    =>
    (call ?*mc* addRecomendacion "Ruta de las cascadas")
)

(defrule r10
	(clima (tipo-clima "frío")) (lugares(lugares-interes "parques nacionales"))
    =>
    (call ?*mc* addRecomendacion "Cotacachi")
)

(defrule r11
	(clima (tipo-clima "frío")) (lugares(lugares-interes "monumentos"))
    =>
    (call ?*mc* addRecomendacion "Plaza Foch")
    (call ?*mc* addRecomendacion "Cumanda Parque Urbano")
)

(defrule r12
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "playa")) (or(actividades(tipo-actividades "pesca"))(actividades(tipo-actividades "tours")))
    =>
    (call ?*mc* addRecomendacion "Puerto López")
)

(defrule r13
	(actividades(tipo-actividades "surf"))
    =>
    (call ?*mc* addRecomendacion "Chocolatera")
    (call ?*mc* addRecomendacion "Ocean Freaks")
    (call ?*mc* addRecomendacion "Betty Surf and Yoga")
    (call ?*mc* addRecomendacion "Montanita")
)

(defrule r14
	(actividades(tipo-actividades "relajacion"))
    =>
    (call ?*mc* addRecomendacion "Yerba linda Spa y Masajes")
    (call ?*mc* addRecomendacion "Cascada Spa Ecuador")
)

(defrule r15
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "flora y fauna")) (actividades(tipo-actividades "ciclismo"))
    =>
    (printout t "Baños: Ruta de las cascadas" crlf)    
)

(defrule r16
	(clima (tipo-clima "húmedo")) (or(actividades(tipo-actividades "kayak")) (actividades(tipo-actividades "parapente")))
    =>
    (call ?*mc* addRecomendacion "Raft Amazonia")
)
(defrule r17
	(clima (tipo-clima "frío")) (actividades(tipo-actividades "Tours")) 
    =>
    (call ?*mc* addRecomendacion "La Nariz del Diablo")
)


(defrule r18
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "parques nacionales")) (actividades(tipo-actividades "tours"))
    =>
    (printout t "Galapagos: Ruta de las cascadas" crlf)    
)

(defrule r19
	(clima (tipo-clima "frío")) (lugares(lugares-interes "museos")) (actividades(tipo-actividades "tour"))
    =>
    (call ?*mc* addRecomendacion "Museo Mindalae")
)

(defrule r20
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "playas")) (or(actividades(tipo-actividades "buceo"))(actividades(tipo-actividades "tours")))
    =>
    (call ?*mc* addRecomendacion "Puerto López")
)

(defrule r21
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "museos")) (actividades(tipo-actividades "tour"))
    =>
    (call ?*mc* addRecomendacion "Museo Miniatura Guayaquil")
)

(defrule r22
	(clima (tipo-clima "frío")) (lugares(lugares-interes "museos")) (actividades(tipo-actividades "tour"))
    =>
    (call ?*mc* addRecomendacion "Museo Casa de Sucre")
)

(defrule r23
	(clima (tipo-clima "frío")) (lugares(lugares-interes "parques urbanos")) (or(actividades(tipo-actividades "montañismo")) (actividades(tipo-actividades "diversión y juegos")))
    =>
    (call ?*mc* addRecomendacion "Teleferico")
)

(defrule r24
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "zoológicos")) (actividades(tipo-actividades "montañismo"))
    =>
    (call ?*mc* addRecomendacion "El pantanal")
)

(defrule r25
	(clima (tipo-clima "húmedo")) (lugares(lugares-interes "zoológicos")) (actividades(tipo-actividades "montañismo"))
    =>
    (call ?*mc* addRecomendacion "Amazoonico Animal Rescue Centre")
)


(defrule r26
	(clima (tipo-clima "frío")) (lugares(lugares-interes "zoológicos")) (actividades(tipo-actividades "montañismo"))
    =>
    (call ?*mc* addRecomendacion "Amaru Zoológico")
)

(defrule r27
	(clima (tipo-clima "cálido")) (lugares(lugares-interes "parques urbanos")) (actividades(tipo-actividades "montañismo"))
    =>
    (call ?*mc* addRecomendacion "Parque de las Iguanas")
)

(defrule r28
	(clima (tipo-clima "frío")) (lugares(lugares-interes "flora y fauna")) (or(actividades(tipo-actividades "tours"))(actividades(tipo-actividades "montañismo"))) 
    =>
    (call ?*mc* addRecomendacion "Casa Del Arbol")
)


(defrule r29
	(clima (tipo-clima "frío")) (lugares(lugares-interes "centro comerciales")) (actividades(tipo-actividades "relajación"))
    =>
    (call ?*mc* addRecomendacion "Cascada Spa Ecuador")
)

(defrule r30
	(clima (tipo-clima "frío")) (lugares(lugares-interes "zoológicos")) (actividades(tipo-actividades "montañismo"))
    =>
    (printout t "Cuenca: Amaru Zoológico" crlf)    
)

(defrule r31
	(clima (tipo-clima "frío")) (or(lugares(lugares-interes "sitios tradicionales")) (lugares(lugares-interes "lugares religiosos")))
    =>
    (call ?*mc* addRecomendacion "Catedral de Quito")
)


(defrule r32
	(clima (tipo-clima "frío")) (or(lugares(lugares-interes "museos"))(lugares(lugares-interes "sitios tradicionales"))) (actividades(tipo-actividades "tours"))
    =>
    (call ?*mc* addRecomendacion "Mitad del mundo")
)

(defrule r33
	(clima (tipo-clima "frío")) (lugares(lugares-interes "sitios tradicionales")) (actividades(tipo-actividades "tour"))
    =>
    (call ?*mc* addRecomendacion "Ruinas Ingapirca")
)

(defrule r34
	(clima (tipo-clima "frío")) (lugares(lugares-interes "parque nacionales")) (actividades(tipo-actividades "kayak"))
    =>
    (call ?*mc* addRecomendacion "Laguna Quilotoa")
)
(run)

