package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class xb
  extends com.tencent.mm.bk.a
{
  public String mwP;
  public String rCs;
  public long rCt;
  public long rCu;
  public String rCv;
  public long rCw;
  public LinkedList<xc> rkt = new LinkedList();
  public String rqo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rCs != null) {
        paramVarArgs.g(1, this.rCs);
      }
      paramVarArgs.d(2, 8, this.rkt);
      paramVarArgs.T(3, this.rCt);
      paramVarArgs.T(4, this.rCu);
      if (this.rCv != null) {
        paramVarArgs.g(5, this.rCv);
      }
      if (this.mwP != null) {
        paramVarArgs.g(6, this.mwP);
      }
      paramVarArgs.T(7, this.rCw);
      if (this.rqo != null) {
        paramVarArgs.g(8, this.rqo);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rCs == null) {
        break label598;
      }
    }
    label598:
    for (paramInt = f.a.a.b.b.a.h(1, this.rCs) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 8, this.rkt) + f.a.a.a.S(3, this.rCt) + f.a.a.a.S(4, this.rCu);
      paramInt = i;
      if (this.rCv != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rCv);
      }
      i = paramInt;
      if (this.mwP != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.mwP);
      }
      i += f.a.a.a.S(7, this.rCw);
      paramInt = i;
      if (this.rqo != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rqo);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rkt.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        xb localxb = (xb)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localxb.rCs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new xc();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((xc)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localxb.rkt.add(localObject1);
            paramInt += 1;
          }
        case 3: 
          localxb.rCt = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 4: 
          localxb.rCu = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 5: 
          localxb.rCv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localxb.mwP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localxb.rCw = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        }
        localxb.rqo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/xb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */