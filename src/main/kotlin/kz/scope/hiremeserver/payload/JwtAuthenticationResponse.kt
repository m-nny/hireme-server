package kz.scope.hiremeserver.payload

/**
 * Created by scope team on 19/08/17.
 */
data class JwtAuthenticationResponse(var accessToken: String) {
    var tokenType = "Bearer"
}
