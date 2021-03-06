package fastcampus.aop.part3.aop.part4.aop_part4_chapter05.utillity

import android.content.Context
import androidx.preference.PreferenceManager

class AuthTokenProvider(private val context: Context) {

    companion object {

        private const val KEY_AUTH_TOKEN = "auth_token"
    }

    fun updateToken(token: String) {
        PreferenceManager.getDefaultSharedPreferences(context).edit()
            .putString(KEY_AUTH_TOKEN, token)
            .apply()
    }

    val token: String?
        get() = PreferenceManager.getDefaultSharedPreferences(context)
            .getString(KEY_AUTH_TOKEN, null)

}