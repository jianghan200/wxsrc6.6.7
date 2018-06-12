package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ato
  extends com.tencent.mm.bk.a
{
  public int hcE;
  public String jSA;
  public int lOH;
  public int rWU;
  public bhz rck;
  public String rco;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rck == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.rck != null)
      {
        paramVarArgs.fV(1, this.rck.boi());
        this.rck.a(paramVarArgs);
      }
      if (this.jSA != null) {
        paramVarArgs.g(2, this.jSA);
      }
      paramVarArgs.fT(3, this.hcE);
      paramVarArgs.fT(4, this.lOH);
      paramVarArgs.fT(5, this.rWU);
      if (this.rco != null) {
        paramVarArgs.g(6, this.rco);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rck == null) {
        break label532;
      }
    }
    label532:
    for (paramInt = f.a.a.a.fS(1, this.rck.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jSA != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jSA);
      }
      i = i + f.a.a.a.fQ(3, this.hcE) + f.a.a.a.fQ(4, this.lOH) + f.a.a.a.fQ(5, this.rWU);
      paramInt = i;
      if (this.rco != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rco);
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
        if (this.rck != null) {
          break;
        }
        throw new b("Not all required fields were included: ToUserName");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ato localato = (ato)paramVarArgs[1];
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
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localato.rck = ((bhz)localObject1);
            paramInt += 1;
          }
        case 2: 
          localato.jSA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localato.hcE = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localato.lOH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localato.rWU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localato.rco = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ato.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */