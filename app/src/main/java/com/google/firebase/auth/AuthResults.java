

package com.google.firebase.auth;

import androidx.annotation.Nullable;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AdditionalUserInfo;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;




public interface AuthResults extends SafeParcelable {
    @Nullable
    FirebaseUser getUser();

    @Nullable
    AdditionalUserInfo getAdditionalUserinfo();

    @Nullable
    AuthCredential getCredential();
}
