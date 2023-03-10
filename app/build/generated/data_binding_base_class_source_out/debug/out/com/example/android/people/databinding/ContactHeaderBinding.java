// Generated by view binder compiler. Do not edit!
package com.example.android.people.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.android.people.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ContactHeaderBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView card;

  @NonNull
  public final LinearLayoutCompat cardLayout;

  @NonNull
  public final Button grant;

  @NonNull
  public final TextView message;

  @NonNull
  public final TextView rationale;

  private ContactHeaderBinding(@NonNull CardView rootView, @NonNull CardView card,
      @NonNull LinearLayoutCompat cardLayout, @NonNull Button grant, @NonNull TextView message,
      @NonNull TextView rationale) {
    this.rootView = rootView;
    this.card = card;
    this.cardLayout = cardLayout;
    this.grant = grant;
    this.message = message;
    this.rationale = rationale;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ContactHeaderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContactHeaderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.contact_header, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContactHeaderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView card = (CardView) rootView;

      id = R.id.card_layout;
      LinearLayoutCompat cardLayout = ViewBindings.findChildViewById(rootView, id);
      if (cardLayout == null) {
        break missingId;
      }

      id = R.id.grant;
      Button grant = ViewBindings.findChildViewById(rootView, id);
      if (grant == null) {
        break missingId;
      }

      id = R.id.message;
      TextView message = ViewBindings.findChildViewById(rootView, id);
      if (message == null) {
        break missingId;
      }

      id = R.id.rationale;
      TextView rationale = ViewBindings.findChildViewById(rootView, id);
      if (rationale == null) {
        break missingId;
      }

      return new ContactHeaderBinding((CardView) rootView, card, cardLayout, grant, message,
          rationale);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
