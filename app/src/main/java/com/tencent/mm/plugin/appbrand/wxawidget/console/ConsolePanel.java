package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.tencent.mm.modelappbrand.LogInfo;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.mm.plugin.appbrand.wxawidget.b.b;
import com.tencent.mm.plugin.appbrand.wxawidget.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;
import java.util.List;

public class ConsolePanel
  extends FrameLayout
  implements com.tencent.mm.plugin.appbrand.wxawidget.a
{
  final List<LogInfo> gQl = new LinkedList();
  EditText gQr;
  Button[] gQs;
  Button gQt;
  Button gQu;
  a gQv;
  int gQw;
  String gQx;
  MRecyclerView gvH;
  
  public ConsolePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initialize();
  }
  
  public ConsolePanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    initialize();
  }
  
  private void cd(int paramInt1, int paramInt2)
  {
    Button localButton = (Button)findViewById(paramInt2);
    localButton.setOnClickListener(new ConsolePanel.8(this));
    this.gQs[paramInt1] = localButton;
  }
  
  private void initialize()
  {
    LayoutInflater.from(getContext()).inflate(b.c.console_panel, this, true);
    this.gQr = ((EditText)findViewById(b.b.console_dt));
    this.gQr.clearFocus();
    this.gQs = new Button[5];
    cd(0, b.b.log_all_btn);
    cd(1, b.b.log_log_btn);
    cd(2, b.b.log_info_btn);
    cd(3, b.b.log_warn_btn);
    cd(4, b.b.log_error_btn);
    this.gQs[0].setSelected(true);
    this.gQw = 0;
    this.gQt = ((Button)findViewById(b.b.clear_log_btn));
    this.gQu = ((Button)findViewById(b.b.save_log_btn));
    this.gQu.setEnabled(false);
    this.gQt.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        ConsolePanel.this.gQl.clear();
        ConsolePanel.this.gQv.gQl.clear();
        ConsolePanel.this.gQv.RR.notifyChanged();
      }
    });
    this.gQu.setOnClickListener(new ConsolePanel.2(this));
    this.gQr.addTextChangedListener(new ConsolePanel.3(this));
    this.gQr.setOnKeyListener(new ConsolePanel.4(this));
    this.gQr.setOnFocusChangeListener(new ConsolePanel.5(this));
    findViewById(b.b.do_filter_btn).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        ConsolePanel.this.gQx = ConsolePanel.this.gQr.getText().toString();
        ConsolePanel.a(ConsolePanel.this);
      }
    });
    setOnTouchListener(new ConsolePanel.7(this));
    this.gvH = ((MRecyclerView)findViewById(b.b.log_rv));
    this.gQv = new a(getContext());
    MRecyclerView localMRecyclerView = this.gvH;
    getContext();
    localMRecyclerView.setLayoutManager(new LinearLayoutManager());
    this.gvH.setItemAnimator(null);
    this.gvH.setAdapter(this.gQv);
  }
  
  private boolean wr(String paramString)
  {
    return (!bi.oW(this.gQx)) && ((paramString == null) || (!paramString.toLowerCase().contains(this.gQx.toLowerCase())));
  }
  
  public final void at(List<LogInfo> paramList)
  {
    if (paramList == null) {}
    LinkedList localLinkedList;
    do
    {
      return;
      localLinkedList = new LinkedList();
      int i = 0;
      while (i < paramList.size())
      {
        LogInfo localLogInfo = (LogInfo)paramList.get(i);
        this.gQl.add(localLogInfo);
        if (((localLogInfo.level == this.gQw) || (this.gQw == 0)) && (!wr(localLogInfo.message))) {
          localLinkedList.add(localLogInfo);
        }
        i += 1;
      }
    } while (localLinkedList.isEmpty());
    com.tencent.mm.bu.a.ab(new ConsolePanel.9(this, localLinkedList));
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    View localView;
    if (paramMotionEvent.getAction() == 0)
    {
      localView = ((Activity)getContext()).getCurrentFocus();
      if ((localView == null) || (!(localView instanceof EditText))) {
        break label143;
      }
      int[] arrayOfInt = new int[2];
      int[] tmp39_37 = arrayOfInt;
      tmp39_37[0] = 0;
      int[] tmp43_39 = tmp39_37;
      tmp43_39[1] = 0;
      tmp43_39;
      localView.getLocationInWindow(arrayOfInt);
      i = arrayOfInt[0];
      int j = arrayOfInt[1];
      int k = localView.getHeight();
      int m = localView.getWidth();
      if ((paramMotionEvent.getX() > i) && (paramMotionEvent.getX() < m + i) && (paramMotionEvent.getY() > j) && (paramMotionEvent.getY() < k + j)) {
        break label143;
      }
    }
    label143:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        f.ck(localView);
      }
      return super.dispatchTouchEvent(paramMotionEvent);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/wxawidget/console/ConsolePanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */