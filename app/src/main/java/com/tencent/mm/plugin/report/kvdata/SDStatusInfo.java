package com.tencent.mm.plugin.report.kvdata;

import f.a.a.b;
import java.util.LinkedList;

public class SDStatusInfo
  extends com.tencent.mm.bk.a
{
  public long eAvailableBlockCount_;
  public int eAvailablePer_;
  public long eAvailableSize_;
  public long eBlockCount_;
  public long eBlockSize_;
  public String ePath_;
  public long eTotalSize_;
  public String fSystem_;
  public int hasUnRemovable_;
  public int ratioHeavy_;
  public String root_;
  public long sAvailableBlockCount_;
  public int sAvailablePer_;
  public long sAvailableSize_;
  public long sBlockCount_;
  public long sBlockSize_;
  public long sTotalSize_;
  public int sizeHeavy_;
  public int useExternal_;
  public int weChatPer_;
  public WeChatSDInfo weChatSDInfo_;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.weChatSDInfo_ == null) {
        throw new b("Not all required fields were included: weChatSDInfo_");
      }
      if (this.weChatSDInfo_ != null)
      {
        paramVarArgs.fV(1, this.weChatSDInfo_.boi());
        this.weChatSDInfo_.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.weChatPer_);
      paramVarArgs.fT(3, this.sizeHeavy_);
      paramVarArgs.fT(4, this.ratioHeavy_);
      paramVarArgs.fT(5, this.useExternal_);
      paramVarArgs.fT(6, this.hasUnRemovable_);
      paramVarArgs.T(7, this.sBlockSize_);
      paramVarArgs.T(8, this.sBlockCount_);
      paramVarArgs.T(9, this.sTotalSize_);
      paramVarArgs.T(10, this.sAvailableBlockCount_);
      paramVarArgs.T(11, this.sAvailableSize_);
      paramVarArgs.fT(12, this.sAvailablePer_);
      paramVarArgs.T(13, this.eBlockSize_);
      paramVarArgs.T(14, this.eBlockCount_);
      paramVarArgs.T(15, this.eTotalSize_);
      paramVarArgs.T(16, this.eAvailableBlockCount_);
      paramVarArgs.T(17, this.eAvailableSize_);
      paramVarArgs.fT(18, this.eAvailablePer_);
      if (this.ePath_ != null) {
        paramVarArgs.g(19, this.ePath_);
      }
      if (this.root_ != null) {
        paramVarArgs.g(20, this.root_);
      }
      if (this.fSystem_ != null) {
        paramVarArgs.g(21, this.fSystem_);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.weChatSDInfo_ == null) {
        break label1133;
      }
    }
    label1133:
    for (paramInt = f.a.a.a.fS(1, this.weChatSDInfo_.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.weChatPer_) + f.a.a.a.fQ(3, this.sizeHeavy_) + f.a.a.a.fQ(4, this.ratioHeavy_) + f.a.a.a.fQ(5, this.useExternal_) + f.a.a.a.fQ(6, this.hasUnRemovable_) + f.a.a.a.S(7, this.sBlockSize_) + f.a.a.a.S(8, this.sBlockCount_) + f.a.a.a.S(9, this.sTotalSize_) + f.a.a.a.S(10, this.sAvailableBlockCount_) + f.a.a.a.S(11, this.sAvailableSize_) + f.a.a.a.fQ(12, this.sAvailablePer_) + f.a.a.a.S(13, this.eBlockSize_) + f.a.a.a.S(14, this.eBlockCount_) + f.a.a.a.S(15, this.eTotalSize_) + f.a.a.a.S(16, this.eAvailableBlockCount_) + f.a.a.a.S(17, this.eAvailableSize_) + f.a.a.a.fQ(18, this.eAvailablePer_);
      paramInt = i;
      if (this.ePath_ != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.ePath_);
      }
      i = paramInt;
      if (this.root_ != null) {
        i = paramInt + f.a.a.b.b.a.h(20, this.root_);
      }
      paramInt = i;
      if (this.fSystem_ != null) {
        paramInt = i + f.a.a.b.b.a.h(21, this.fSystem_);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.weChatSDInfo_ != null) {
          break;
        }
        throw new b("Not all required fields were included: weChatSDInfo_");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        SDStatusInfo localSDStatusInfo = (SDStatusInfo)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new WeChatSDInfo();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((WeChatSDInfo)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localSDStatusInfo.weChatSDInfo_ = ((WeChatSDInfo)localObject1);
            paramInt += 1;
          }
        case 2: 
          localSDStatusInfo.weChatPer_ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localSDStatusInfo.sizeHeavy_ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localSDStatusInfo.ratioHeavy_ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localSDStatusInfo.useExternal_ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localSDStatusInfo.hasUnRemovable_ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localSDStatusInfo.sBlockSize_ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 8: 
          localSDStatusInfo.sBlockCount_ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 9: 
          localSDStatusInfo.sTotalSize_ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 10: 
          localSDStatusInfo.sAvailableBlockCount_ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 11: 
          localSDStatusInfo.sAvailableSize_ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 12: 
          localSDStatusInfo.sAvailablePer_ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localSDStatusInfo.eBlockSize_ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 14: 
          localSDStatusInfo.eBlockCount_ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 15: 
          localSDStatusInfo.eTotalSize_ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 16: 
          localSDStatusInfo.eAvailableBlockCount_ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 17: 
          localSDStatusInfo.eAvailableSize_ = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 18: 
          localSDStatusInfo.eAvailablePer_ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 19: 
          localSDStatusInfo.ePath_ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 20: 
          localSDStatusInfo.root_ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localSDStatusInfo.fSystem_ = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/report/kvdata/SDStatusInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */