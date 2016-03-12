(function () {
    'use strict';

    angular.module('projectManager.user').controller('UserController', UserController);

    function UserController($scope, userService) {
        userService.getUser().then(success, error);

        function success(response) {
            $scope.name = response.data.name;
        }

        function error(err) {
            console.log(err);
        }
    }
})();