const express = require('express');
const morgan = require ('morgan');

//initializations
const app = express();

//settings
app.set('port', process.env.PORT || 4000);

//middleware
app.use(morgan('dev'));
app.use(express.urlencoded({extended:false}));
app.use(express.json());

//routes
app.use(require('./routes/index.js'))
app.use('/categoria', require('./routes/categoria.js'))
app.use('/pelicula', require('./routes/pelicula.js'))

//starting server
app.listen(app.get('port'), () => {
    console.log("Server on port", app.get('port'));
});