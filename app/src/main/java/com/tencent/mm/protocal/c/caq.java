package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class caq
  extends bhd
{
  public int rth;
  public int rxG;
  public int soA;
  public int soB;
  public int soC;
  public int soD;
  public LinkedList<Integer> soE = new LinkedList();
  public int soF;
  public int soG;
  public LinkedList<Integer> soH = new LinkedList();
  public int soI;
  public int soJ;
  public int soz;
  
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
      paramVarArgs.fT(2, this.rxG);
      paramVarArgs.fT(3, this.soz);
      paramVarArgs.fT(4, this.rth);
      paramVarArgs.fT(5, this.soA);
      paramVarArgs.fT(6, this.soB);
      paramVarArgs.fT(7, this.soC);
      paramVarArgs.fT(8, this.soD);
      paramVarArgs.c(9, this.soE);
      paramVarArgs.fT(10, this.soF);
      paramVarArgs.fT(11, this.soG);
      paramVarArgs.c(12, this.soH);
      paramVarArgs.fT(13, this.soI);
      paramVarArgs.fT(14, this.soJ);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label814;
      }
    }
    label814:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.rxG) + f.a.a.a.fQ(3, this.soz) + f.a.a.a.fQ(4, this.rth) + f.a.a.a.fQ(5, this.soA) + f.a.a.a.fQ(6, this.soB) + f.a.a.a.fQ(7, this.soC) + f.a.a.a.fQ(8, this.soD) + f.a.a.a.b(9, this.soE) + f.a.a.a.fQ(10, this.soF) + f.a.a.a.fQ(11, this.soG) + f.a.a.a.b(12, this.soH) + f.a.a.a.fQ(13, this.soI) + f.a.a.a.fQ(14, this.soJ);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.soE.clear();
        this.soH.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        caq localcaq = (caq)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          int i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localcaq.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcaq.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localcaq.soz = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localcaq.rth = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localcaq.soA = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localcaq.soB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localcaq.soC = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localcaq.soD = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localcaq.soE = new f.a.a.a.a(((f.a.a.a.a)localObject1).cJR().lR, unknownTagHandler).cJO();
          return 0;
        case 10: 
          localcaq.soF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localcaq.soG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localcaq.soH = new f.a.a.a.a(((f.a.a.a.a)localObject1).cJR().lR, unknownTagHandler).cJO();
          return 0;
        case 13: 
          localcaq.soI = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localcaq.soJ = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/caq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */