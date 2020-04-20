{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf600
{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red22\green21\blue22;\red22\green21\blue22;\red22\green21\blue22;
\red22\green21\blue22;}
{\*\expandedcolortbl;;\cssrgb\c11373\c10980\c11373;\cssrgb\c11373\c10980\c11373\c3922;\cssrgb\c11373\c10980\c11373;
\cssrgb\c11373\c10980\c11373\c3922;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 # Documentacion del trabajo.\
\
# \'bfCu\'e1ntos consumidores se necesitan?\
\
En este caso en particular, necesito un m\'ednimo de 2 consumidores para llegar a stock 0, de manera tal que el consumo sea mayor que la producci\'f3n.\
Podr\'eda darse el caso que con un solo consumidor se llegue a stock 0, por ejemplo si aplicara una prioridad mayor al consumidor que al productor.\
\
# Bloques synchronized, \'bf por qu\'e9 usarlos?\
\
En este caso utilic\'e9 bloques synchronized en producir una cerveza y en consumir una.\
Es sumamente necesario evitar el acceso m\'faltiple a producci\'f3n y consumo ya que de otra manera se alterar\'edan los valores reales de consumo y producci\'f3n.\
\
# Recurso compartido\
\
\pard\pardeftab720\sl360\partightenfactor0
\cf2 \cb3 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 El recurso compartido en este caso ser\'e1 la unidad de cerveza creada y consumida.\
En mi ejemplo de la clase Main muestro como una cervecer\'eda \'93Antares\'94 procede para otra cervecer\'eda \'93Cheverry\'94 y viceversa. Mientras que los consumidores, personas que frecuentan los bares, ir\'e1n consumiendo del producto en paralelismo a la produccion .\
\
# Tres formas de crear Threads.\
En mi trabajo, mostr\'e9 como ejecutar dos de ellas.\
1)Implementando la clase runnable, lo cual me permitida poder Heredar de otra clase e implementes mas interfaces.\
Instanciacion : new Thread ( new ClaseNueva() ) \
2) Extender directamente de la clase Thread, impidiendo poder Heredar de otra clase.\
\pard\pardeftab720\sl360\partightenfactor0
\cf4 \cb5 \outl0\strokewidth0 Instanciacion : new ClaseNueva(). \
3) En caso de que Herede de una clase que implementa runnable, este es un caso muy particular de los frameworks de Java.\cf2 \cb3 \outl0\strokewidth0 \strokec2 \
\pard\pardeftab720\sl360\partightenfactor0

\f1 \cf2 \
}