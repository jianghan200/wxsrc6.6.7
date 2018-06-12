package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bsd
  extends com.tencent.mm.bk.a
{
  public String rbW;
  public String spJ;
  public chn spM;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.spJ == null) {
        throw new b("Not all required fields were included: WxaUserName");
      }
      if (this.spJ != null) {
        paramVarArgs.g(1, this.spJ);
      }
      if (this.spM != null)
      {
        paramVarArgs.fV(2, this.spM.boi());
        this.spM.a(paramVarArgs);
      }
      if (this.rbW != null) {
        paramVarArgs.g(3, this.rbW);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.spJ == null) {
        break label415;
      }
    }
    label415:
    for (int i = f.a.a.b.b.a.h(1, this.spJ) + 0;; i = 0)
    {
      paramInt = i;
      if (this.spM != null) {
        paramInt = i + f.a.a.a.fS(2, this.spM.boi());
      }
      i = paramInt;
      if (this.rbW != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rbW);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.spJ != null) {
          break;
        }
        throw new b("Not all required fields were included: WxaUserName");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bsd localbsd = (bsd)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbsd.spJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new chn();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((chn)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbsd.spM = ((chn)localObject1);
            paramInt += 1;
          }
        }
        localbsd.rbW = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bsd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */