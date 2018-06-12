package com.tencent.mm.plugin.report.kvdata;

public class HeavyDetailInfo
  extends com.tencent.mm.bk.a
{
  public long chatroom_;
  public long contact_;
  public long conversation_;
  public long dbSize_;
  public long favDbSize_;
  public long flag_;
  public long message_;
  public long sdFileRatio_;
  public long sdFileSize_;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.flag_);
      paramVarArgs.T(2, this.sdFileSize_);
      paramVarArgs.T(3, this.sdFileRatio_);
      paramVarArgs.T(4, this.dbSize_);
      paramVarArgs.T(5, this.message_);
      paramVarArgs.T(6, this.conversation_);
      paramVarArgs.T(7, this.contact_);
      paramVarArgs.T(8, this.chatroom_);
      paramVarArgs.T(9, this.favDbSize_);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.S(1, this.flag_) + 0 + f.a.a.a.S(2, this.sdFileSize_) + f.a.a.a.S(3, this.sdFileRatio_) + f.a.a.a.S(4, this.dbSize_) + f.a.a.a.S(5, this.message_) + f.a.a.a.S(6, this.conversation_) + f.a.a.a.S(7, this.contact_) + f.a.a.a.S(8, this.chatroom_) + f.a.a.a.S(9, this.favDbSize_);
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
      HeavyDetailInfo localHeavyDetailInfo = (HeavyDetailInfo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localHeavyDetailInfo.flag_ = locala.vHC.rZ();
        return 0;
      case 2: 
        localHeavyDetailInfo.sdFileSize_ = locala.vHC.rZ();
        return 0;
      case 3: 
        localHeavyDetailInfo.sdFileRatio_ = locala.vHC.rZ();
        return 0;
      case 4: 
        localHeavyDetailInfo.dbSize_ = locala.vHC.rZ();
        return 0;
      case 5: 
        localHeavyDetailInfo.message_ = locala.vHC.rZ();
        return 0;
      case 6: 
        localHeavyDetailInfo.conversation_ = locala.vHC.rZ();
        return 0;
      case 7: 
        localHeavyDetailInfo.contact_ = locala.vHC.rZ();
        return 0;
      case 8: 
        localHeavyDetailInfo.chatroom_ = locala.vHC.rZ();
        return 0;
      }
      localHeavyDetailInfo.favDbSize_ = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/report/kvdata/HeavyDetailInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */