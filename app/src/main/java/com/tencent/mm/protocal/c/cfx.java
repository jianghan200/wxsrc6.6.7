package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cfx
  extends com.tencent.mm.bk.a
{
  public String rcY;
  public String rwk;
  public int sAo;
  public int sAp;
  public String sAt;
  public cfq sAu;
  public cfw sAv;
  public String syW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sAt == null) {
        throw new b("Not all required fields were included: EntranceDomain");
      }
      if (this.syW == null) {
        throw new b("Not all required fields were included: Charset");
      }
      if (this.sAt != null) {
        paramVarArgs.g(4, this.sAt);
      }
      if (this.syW != null) {
        paramVarArgs.g(12, this.syW);
      }
      if (this.sAu != null)
      {
        paramVarArgs.fV(9, this.sAu.boi());
        this.sAu.a(paramVarArgs);
      }
      if (this.sAv != null)
      {
        paramVarArgs.fV(10, this.sAv.boi());
        this.sAv.a(paramVarArgs);
      }
      if (this.rwk != null) {
        paramVarArgs.g(5, this.rwk);
      }
      if (this.rcY != null) {
        paramVarArgs.g(6, this.rcY);
      }
      paramVarArgs.fT(7, this.sAo);
      paramVarArgs.fT(8, this.sAp);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sAt == null) {
        break label796;
      }
    }
    label796:
    for (int i = f.a.a.b.b.a.h(4, this.sAt) + 0;; i = 0)
    {
      paramInt = i;
      if (this.syW != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.syW);
      }
      i = paramInt;
      if (this.sAu != null) {
        i = paramInt + f.a.a.a.fS(9, this.sAu.boi());
      }
      paramInt = i;
      if (this.sAv != null) {
        paramInt = i + f.a.a.a.fS(10, this.sAv.boi());
      }
      i = paramInt;
      if (this.rwk != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rwk);
      }
      paramInt = i;
      if (this.rcY != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rcY);
      }
      return paramInt + f.a.a.a.fQ(7, this.sAo) + f.a.a.a.fQ(8, this.sAp);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.sAt == null) {
          throw new b("Not all required fields were included: EntranceDomain");
        }
        if (this.syW != null) {
          break;
        }
        throw new b("Not all required fields were included: Charset");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cfx localcfx = (cfx)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 11: 
        default: 
          return -1;
        case 4: 
          localcfx.sAt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localcfx.syW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cfq();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cfq)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcfx.sAu = ((cfq)localObject1);
            paramInt += 1;
          }
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cfw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cfw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcfx.sAv = ((cfw)localObject1);
            paramInt += 1;
          }
        case 5: 
          localcfx.rwk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localcfx.rcY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localcfx.sAo = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localcfx.sAp = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cfx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */