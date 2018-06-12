package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class baa
  extends bhd
{
  public int qZe;
  public int rmJ;
  public aw rmQ;
  public String scJ;
  public String scK;
  public b scL;
  public int scM;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.scJ != null) {
        paramVarArgs.g(2, this.scJ);
      }
      if (this.scK != null) {
        paramVarArgs.g(3, this.scK);
      }
      if (this.scL != null) {
        paramVarArgs.b(4, this.scL);
      }
      paramVarArgs.fT(5, this.rmJ);
      paramVarArgs.fT(6, this.qZe);
      paramVarArgs.fT(7, this.scM);
      if (this.rmQ != null)
      {
        paramVarArgs.fV(8, this.rmQ.boi());
        this.rmQ.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label701;
      }
    }
    label701:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.scJ != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.scJ);
      }
      i = paramInt;
      if (this.scK != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.scK);
      }
      paramInt = i;
      if (this.scL != null) {
        paramInt = i + f.a.a.a.a(4, this.scL);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rmJ) + f.a.a.a.fQ(6, this.qZe) + f.a.a.a.fQ(7, this.scM);
      paramInt = i;
      if (this.rmQ != null) {
        paramInt = i + f.a.a.a.fS(8, this.rmQ.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        baa localbaa = (baa)paramVarArgs[1];
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
            localbaa.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbaa.scJ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbaa.scK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbaa.scL = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 5: 
          localbaa.rmJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbaa.qZe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbaa.scM = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aw();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localbaa.rmQ = ((aw)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/baa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */