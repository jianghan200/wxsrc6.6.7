package com.tencent.sqlitelint.behaviour.alert;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.sqlitelint.SQLiteLintIssue;
import com.tencent.sqlitelint.behaviour.a.a;
import com.tencent.sqlitelint.d.b;
import com.tencent.sqlitelint.d.c;
import com.tencent.sqlitelint.d.d;
import com.tencent.sqlitelint.util.SLog;
import com.tencent.sqlitelint.util.SQLiteLintUtil;
import java.util.List;

public class CheckResultActivity
  extends SQLiteLintBaseActivity
{
  private a vnA;
  private String vny;
  private List<SQLiteLintIssue> vnz;
  
  private void cCe()
  {
    List localList = a.acK(this.vny);
    if (this.vnz == null) {
      this.vnz = localList;
    }
    for (;;)
    {
      SLog.d("MpApp.CheckResultActivity", "refreshData size %d", new Object[] { Integer.valueOf(this.vnz.size()) });
      this.vnA.notifyDataSetChanged();
      return;
      this.vnz.clear();
      this.vnz.addAll(localList);
    }
  }
  
  protected final int getLayoutId()
  {
    return d.c.activity_check_result;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.vny = getIntent().getStringExtra("db_label");
    paramBundle = SQLiteLintUtil.acM(this.vny);
    setTitle(getString(d.d.check_result_title, new Object[] { paramBundle }));
    paramBundle = (ListView)findViewById(d.b.list);
    this.vnA = new a();
    paramBundle.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        paramAnonymousAdapterView = (SQLiteLintIssue)paramAnonymousAdapterView.getItemAtPosition(paramAnonymousInt);
        paramAnonymousView = new Intent();
        paramAnonymousView.putExtra("issue", paramAnonymousAdapterView);
        paramAnonymousView.setClass(CheckResultActivity.this.getBaseContext(), IssueDetailActivity.class);
        CheckResultActivity.this.startActivity(paramAnonymousView);
      }
    });
    paramBundle.setAdapter(this.vnA);
    this.vnA.notifyDataSetChanged();
    cCe();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    cCe();
  }
  
  final class a
    extends BaseAdapter
  {
    private final LayoutInflater Bc = LayoutInflater.from(CheckResultActivity.this);
    
    a() {}
    
    private SQLiteLintIssue Ht(int paramInt)
    {
      return (SQLiteLintIssue)CheckResultActivity.a(CheckResultActivity.this).get(paramInt);
    }
    
    public final int getCount()
    {
      if (CheckResultActivity.a(CheckResultActivity.this) == null) {
        return 0;
      }
      return CheckResultActivity.a(CheckResultActivity.this).size();
    }
    
    public final long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null)
      {
        paramView = this.Bc.inflate(d.c.view_check_result_item, paramViewGroup, false);
        paramViewGroup = new CheckResultActivity.b();
        paramViewGroup.vnC = ((TextView)paramView.findViewById(d.b.result_tv));
        paramViewGroup.vnD = ((TextView)paramView.findViewById(d.b.diagnosis_level_tv));
        paramViewGroup.hrV = ((TextView)paramView.findViewById(d.b.time_tv));
        paramView.setTag(paramViewGroup);
      }
      for (;;)
      {
        SQLiteLintIssue localSQLiteLintIssue = Ht(paramInt);
        paramViewGroup.vnC.setText(String.format("%d、%s", new Object[] { Integer.valueOf(paramInt + 1), localSQLiteLintIssue.desc }));
        paramViewGroup.hrV.setText(SQLiteLintUtil.h("yyyy-MM-dd HH:mm", localSQLiteLintIssue.createTime));
        paramViewGroup.vnD.setText(SQLiteLintIssue.getLevelText(localSQLiteLintIssue.level, CheckResultActivity.this.getBaseContext()));
        return paramView;
        paramViewGroup = (CheckResultActivity.b)paramView.getTag();
      }
    }
  }
  
  static final class b
  {
    public TextView hrV;
    public TextView vnC;
    public TextView vnD;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/sqlitelint/behaviour/alert/CheckResultActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */