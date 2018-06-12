package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class bkq
  extends com.tencent.mm.bk.a
{
  public String eup;
  public String rcw;
  public String skb;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.eup == null) {
        throw new b("Not all required fields were included: tp_username");
      }
      if (this.skb == null) {
        throw new b("Not all required fields were included: verify_content");
      }
      if (this.rcw == null) {
        throw new b("Not all required fields were included: antispam_ticket");
      }
      if (this.eup != null) {
        paramVarArgs.g(1, this.eup);
      }
      if (this.skb != null) {
        paramVarArgs.g(2, this.skb);
      }
      if (this.rcw != null) {
        paramVarArgs.g(3, this.rcw);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.eup == null) {
        break label389;
      }
    }
    label389:
    for (int i = f.a.a.b.b.a.h(1, this.eup) + 0;; i = 0)
    {
      paramInt = i;
      if (this.skb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.skb);
      }
      i = paramInt;
      if (this.rcw != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rcw);
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
        if (this.eup == null) {
          throw new b("Not all required fields were included: tp_username");
        }
        if (this.skb == null) {
          throw new b("Not all required fields were included: verify_content");
        }
        if (this.rcw != null) {
          break;
        }
        throw new b("Not all required fields were included: antispam_ticket");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bkq localbkq = (bkq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbkq.eup = locala.vHC.readString();
          return 0;
        case 2: 
          localbkq.skb = locala.vHC.readString();
          return 0;
        }
        localbkq.rcw = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bkq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */