package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class pa
  extends com.tencent.mm.bk.a
{
  public int hcJ;
  public int iwE;
  public LinkedList<apv> jQF = new LinkedList();
  public int rgt;
  public String rjL;
  public String rjM;
  public String rjN;
  public String rjO;
  public String rjP;
  public int rth;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.iwE);
      if (this.rjN != null) {
        paramVarArgs.g(7, this.rjN);
      }
      paramVarArgs.fT(2, this.rgt);
      paramVarArgs.fT(3, this.rth);
      paramVarArgs.d(4, 8, this.jQF);
      if (this.rjL != null) {
        paramVarArgs.g(5, this.rjL);
      }
      if (this.rjM != null) {
        paramVarArgs.g(6, this.rjM);
      }
      if (this.rjO != null) {
        paramVarArgs.g(8, this.rjO);
      }
      if (this.rjP != null) {
        paramVarArgs.g(9, this.rjP);
      }
      paramVarArgs.fT(10, this.hcJ);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.fQ(1, this.iwE) + 0;
      paramInt = i;
      if (this.rjN != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rjN);
      }
      i = paramInt + f.a.a.a.fQ(2, this.rgt) + f.a.a.a.fQ(3, this.rth) + f.a.a.a.c(4, 8, this.jQF);
      paramInt = i;
      if (this.rjL != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rjL);
      }
      i = paramInt;
      if (this.rjM != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rjM);
      }
      paramInt = i;
      if (this.rjO != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rjO);
      }
      i = paramInt;
      if (this.rjP != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rjP);
      }
      return i + f.a.a.a.fQ(10, this.hcJ);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.jQF.clear();
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
      pa localpa = (pa)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localpa.iwE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 7: 
        localpa.rjN = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 2: 
        localpa.rgt = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localpa.rth = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 4: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new apv();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((apv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localpa.jQF.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 5: 
        localpa.rjL = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 6: 
        localpa.rjM = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 8: 
        localpa.rjO = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 9: 
        localpa.rjP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      localpa.hcJ = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/pa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */