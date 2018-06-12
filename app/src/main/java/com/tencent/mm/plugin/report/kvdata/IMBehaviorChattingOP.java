package com.tencent.mm.plugin.report.kvdata;

public class IMBehaviorChattingOP
  extends com.tencent.mm.bk.a
{
  public int changeNotifyStatus;
  public int changeSaveAddress;
  public int changeTop;
  public int changeUnread;
  public int expose;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.changeUnread);
      paramVarArgs.fT(2, this.changeTop);
      paramVarArgs.fT(3, this.changeNotifyStatus);
      paramVarArgs.fT(4, this.changeSaveAddress);
      paramVarArgs.fT(5, this.expose);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.changeUnread) + 0 + f.a.a.a.fQ(2, this.changeTop) + f.a.a.a.fQ(3, this.changeNotifyStatus) + f.a.a.a.fQ(4, this.changeSaveAddress) + f.a.a.a.fQ(5, this.expose);
    }
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
      IMBehaviorChattingOP localIMBehaviorChattingOP = (IMBehaviorChattingOP)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localIMBehaviorChattingOP.changeUnread = locala.vHC.rY();
        return 0;
      case 2: 
        localIMBehaviorChattingOP.changeTop = locala.vHC.rY();
        return 0;
      case 3: 
        localIMBehaviorChattingOP.changeNotifyStatus = locala.vHC.rY();
        return 0;
      case 4: 
        localIMBehaviorChattingOP.changeSaveAddress = locala.vHC.rY();
        return 0;
      }
      localIMBehaviorChattingOP.expose = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/report/kvdata/IMBehaviorChattingOP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */