package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class abj
  extends bhd
{
  public String cac;
  public String cad;
  public int cae;
  public String hwf;
  public String qZN;
  public String qZO;
  public int qZP;
  public bqs qZR;
  public String rGk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.cac == null) {
        throw new b("Not all required fields were included: card_id");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.cac != null) {
        paramVarArgs.g(2, this.cac);
      }
      paramVarArgs.fT(3, this.cae);
      if (this.hwf != null) {
        paramVarArgs.g(4, this.hwf);
      }
      if (this.cad != null) {
        paramVarArgs.g(5, this.cad);
      }
      if (this.qZN != null) {
        paramVarArgs.g(6, this.qZN);
      }
      if (this.qZO != null) {
        paramVarArgs.g(7, this.qZO);
      }
      paramVarArgs.fT(8, this.qZP);
      if (this.rGk != null) {
        paramVarArgs.g(9, this.rGk);
      }
      if (this.qZR != null)
      {
        paramVarArgs.fV(10, this.qZR.boi());
        this.qZR.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label870;
      }
    }
    label870:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.cac != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.cac);
      }
      i += f.a.a.a.fQ(3, this.cae);
      paramInt = i;
      if (this.hwf != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.hwf);
      }
      i = paramInt;
      if (this.cad != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.cad);
      }
      paramInt = i;
      if (this.qZN != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.qZN);
      }
      i = paramInt;
      if (this.qZO != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.qZO);
      }
      i += f.a.a.a.fQ(8, this.qZP);
      paramInt = i;
      if (this.rGk != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rGk);
      }
      i = paramInt;
      if (this.qZR != null) {
        i = paramInt + f.a.a.a.fS(10, this.qZR.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.cac != null) {
          break;
        }
        throw new b("Not all required fields were included: card_id");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        abj localabj = (abj)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
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
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localabj.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localabj.cac = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localabj.cae = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localabj.hwf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localabj.cad = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localabj.qZN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localabj.qZO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localabj.qZP = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localabj.rGk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bqs();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bqs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localabj.qZR = ((bqs)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/abj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */