package com.tencent.mm.ar;

import java.util.LinkedList;

public final class d
  extends com.tencent.mm.bk.a
{
  public int ecA;
  public int ecB;
  public int ecC;
  public String ecD;
  public String ecE;
  public int ecF;
  public int ecG;
  public int ecH;
  public LinkedList<e> ecy = new LinkedList();
  public int ecz;
  public int maxSize;
  public String name;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 8, this.ecy);
      if (this.name != null) {
        paramVarArgs.g(2, this.name);
      }
      paramVarArgs.fT(3, this.ecz);
      paramVarArgs.fT(4, this.ecA);
      paramVarArgs.fT(5, this.ecB);
      paramVarArgs.fT(6, this.ecC);
      if (this.ecD != null) {
        paramVarArgs.g(7, this.ecD);
      }
      if (this.ecE != null) {
        paramVarArgs.g(8, this.ecE);
      }
      paramVarArgs.fT(9, this.ecF);
      paramVarArgs.fT(10, this.ecG);
      paramVarArgs.fT(11, this.ecH);
      paramVarArgs.fT(12, this.maxSize);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.c(1, 8, this.ecy) + 0;
      paramInt = i;
      if (this.name != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.name);
      }
      i = paramInt + f.a.a.a.fQ(3, this.ecz) + f.a.a.a.fQ(4, this.ecA) + f.a.a.a.fQ(5, this.ecB) + f.a.a.a.fQ(6, this.ecC);
      paramInt = i;
      if (this.ecD != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.ecD);
      }
      i = paramInt;
      if (this.ecE != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.ecE);
      }
      return i + f.a.a.a.fQ(9, this.ecF) + f.a.a.a.fQ(10, this.ecG) + f.a.a.a.fQ(11, this.ecH) + f.a.a.a.fQ(12, this.maxSize);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ecy.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
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
          localObject1 = new e();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((e)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          locald.ecy.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 2: 
        locald.name = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 3: 
        locald.ecz = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        locald.ecA = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 5: 
        locald.ecB = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 6: 
        locald.ecC = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 7: 
        locald.ecD = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 8: 
        locald.ecE = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 9: 
        locald.ecF = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 10: 
        locald.ecG = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 11: 
        locald.ecH = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      locald.maxSize = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ar/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */