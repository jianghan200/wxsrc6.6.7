package com.tencent.mm.plugin.report.kvdata;

public class log_13913
  extends com.tencent.mm.bk.a
{
  public int clientVersion_;
  public int device_;
  public int ds_;
  public String error_;
  public int import_ds_;
  public int scene_;
  public long time_stamp_;
  public long uin_;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.import_ds_);
      paramVarArgs.fT(2, this.ds_);
      paramVarArgs.T(3, this.uin_);
      paramVarArgs.fT(4, this.device_);
      paramVarArgs.fT(5, this.clientVersion_);
      paramVarArgs.T(6, this.time_stamp_);
      paramVarArgs.fT(7, this.scene_);
      if (this.error_ != null) {
        paramVarArgs.g(8, this.error_);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.import_ds_) + 0 + f.a.a.a.fQ(2, this.ds_) + f.a.a.a.S(3, this.uin_) + f.a.a.a.fQ(4, this.device_) + f.a.a.a.fQ(5, this.clientVersion_) + f.a.a.a.S(6, this.time_stamp_) + f.a.a.a.fQ(7, this.scene_);
      paramInt = i;
    } while (this.error_ == null);
    return i + f.a.a.b.b.a.h(8, this.error_);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      log_13913 locallog_13913 = (log_13913)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        locallog_13913.import_ds_ = locala.vHC.rY();
        return 0;
      case 2: 
        locallog_13913.ds_ = locala.vHC.rY();
        return 0;
      case 3: 
        locallog_13913.uin_ = locala.vHC.rZ();
        return 0;
      case 4: 
        locallog_13913.device_ = locala.vHC.rY();
        return 0;
      case 5: 
        locallog_13913.clientVersion_ = locala.vHC.rY();
        return 0;
      case 6: 
        locallog_13913.time_stamp_ = locala.vHC.rZ();
        return 0;
      case 7: 
        locallog_13913.scene_ = locala.vHC.rY();
        return 0;
      }
      locallog_13913.error_ = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/report/kvdata/log_13913.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */