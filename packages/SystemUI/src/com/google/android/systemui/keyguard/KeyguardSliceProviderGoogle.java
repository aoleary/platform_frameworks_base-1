package com.google.android.systemui.keyguard;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Trace;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;

import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.Slice;
import androidx.slice.builders.ListBuilder;
import androidx.slice.builders.ListBuilder.HeaderBuilder;
import androidx.slice.builders.ListBuilder.RowBuilder;
import androidx.slice.builders.SliceAction;

import com.android.systemui.R;
import com.android.systemui.SystemUIFactory;

import androidx.slice.Slice;
import android.net.Uri;
import com.android.systemui.keyguard.KeyguardSliceProvider;

public class KeyguardSliceProviderGoogle extends KeyguardSliceProvider {

    @Override
    public boolean onCreateSliceProvider() {
        return super.onCreateSliceProvider();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public Slice onBindSlice(Uri uri) {
        return super.onBindSlice(uri);
    }
}
