package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bfj
  extends bhd
{
  public String mEl;
  public int rSt;
  public String rjL;
  public String rjM;
  public String rjN;
  public String rjO;
  public String rjP;
  
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
      if (this.rjL != null) {
        paramVarArgs.g(2, this.rjL);
      }
      if (this.rjM != null) {
        paramVarArgs.g(3, this.rjM);
      }
      if (this.rjN != null) {
        paramVarArgs.g(4, this.rjN);
      }
      if (this.rjO != null) {
        paramVarArgs.g(5, this.rjO);
      }
      if (this.rjP != null) {
        paramVarArgs.g(6, this.rjP);
      }
      paramVarArgs.fT(7, this.rSt);
      if (this.mEl != null) {
        paramVarArgs.g(8, this.mEl);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label646;
      }
    }
    label646:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rjL != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rjL);
      }
      i = paramInt;
      if (this.rjM != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rjM);
      }
      paramInt = i;
      if (this.rjN != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rjN);
      }
      i = paramInt;
      if (this.rjO != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rjO);
      }
      paramInt = i;
      if (this.rjP != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rjP);
      }
      i = paramInt + f.a.a.a.fQ(7, this.rSt);
      paramInt = i;
      if (this.mEl != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.mEl);
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
        bfj localbfj = (bfj)paramVarArgs[1];
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
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbfj.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbfj.rjL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbfj.rjM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbfj.rjN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbfj.rjO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbfj.rjP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbfj.rSt = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbfj.mEl = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bfj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */