/**
 * @author Jean Herrera
 */

var cuestionario = angular.module('modCuestionario', []);

//Banco de preguntas con sus identificadores.
cuestionario.controller('contCuestionario', function($scope){
	$scope.preguntas = [{
		id: 1,
		texto: 'Pregunta 1',
		respuestaValida : 1,
		respuesta: null,
		estado: '',
		respuestas: [{id:1, texto: 'Respuesta 1.1'},
					{id:2, texto: 'Respuesta 1.2'},
					{id:3, texto: 'Respuesta 1.3'}]
	},
	{
		id: 2,
		texto: 'Pregunta 2',
		respuestaValida : 2,
		respuesta: null,
		estado: '',
		respuestas: [{id:1, texto: 'Respuesta 2.1'},
					{id:2, texto: 'Respuesta 2.2'},
					{id:3, texto: 'Respuesta 2.3'}]
	},
	{
		id: 3,
		texto: 'Pregunta 3',
		respuestaValida : 3,
		respuesta: null,
		estado: '',
		respuestas: [{id:1, texto: 'Respuesta 3.1'},
					{id:2, texto: 'Respuesta 3.2'},
					{id:3, texto: 'Respuesta 3.3'}]
	}];

	$scope.respuestasCorrectas = 0;
	$scope.estadoUsuario = '';

	/* Se utiliza la función validar, para sacar la cantidad de preguntas buenas 
	* y las malas que el usuario ha seleccionado.
	*/
	$scope.validar = function(){
	console.log($scope.preguntas);
		$scope.respuestasCorrectas = 0;
		for (var i=0;i<$scope.preguntas.length;i++) {
			if($scope.preguntas[i].respuestaValida == $scope.preguntas[i].respuesta){
				$scope.respuestasCorrectas++;
				$scope.preguntas[i].estado = 'ok';
			}else{
				$scope.preguntas[i].estado = 'error';
			}
		}

		estadoUsuario();
	};

	function estadoUsuario(){
		var total = $scope.respuestasCorrectas/$scope.preguntas.length;

		if (total == 0){
			$scope.estadoUsuario = 'Looser';
		}else if(total == 1){
			$scope.estadoUsuario = 'guru';
		}else{
			$scope.estadoUsuario = 'poor';
		}
	}

});