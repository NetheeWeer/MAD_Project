// Generated by view binder compiler. Do not edit!
package com.example.dashitem.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dashitem.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityItemsCartBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final RecyclerView userList;

  private ActivityItemsCartBinding(@NonNull ConstraintLayout rootView, @NonNull Toolbar toolbar,
      @NonNull RecyclerView userList) {
    this.rootView = rootView;
    this.toolbar = toolbar;
    this.userList = userList;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityItemsCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityItemsCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_items_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityItemsCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.userList;
      RecyclerView userList = ViewBindings.findChildViewById(rootView, id);
      if (userList == null) {
        break missingId;
      }

      return new ActivityItemsCartBinding((ConstraintLayout) rootView, toolbar, userList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
