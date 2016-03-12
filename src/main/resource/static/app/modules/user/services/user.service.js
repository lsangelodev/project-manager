(function () {
    'use strict';

    angular.module('projectManager.user').service('userService', userService);

    function userService($http) {
        this.getUser = getUser;

        function getUser() {
            return $http.get('/user');
        }
    }
})();