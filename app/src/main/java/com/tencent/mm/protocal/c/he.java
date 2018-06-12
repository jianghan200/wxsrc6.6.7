package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class he
  extends bhd
{
  public int rfe;
  public int rhm;
  public String rhn;
  public String rho;
  public String rhp;
  public String rhq;
  public String rhr;
  public String rhs;
  public String rht;
  
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
      paramVarArgs.fT(2, this.rfe);
      paramVarArgs.fT(3, this.rhm);
      if (this.rhn != null) {
        paramVarArgs.g(4, this.rhn);
      }
      if (this.rho != null) {
        paramVarArgs.g(5, this.rho);
      }
      if (this.rhp != null) {
        paramVarArgs.g(6, this.rhp);
      }
      if (this.rhq != null) {
        paramVarArgs.g(7, this.rhq);
      }
      if (this.rhr != null) {
        paramVarArgs.g(8, this.rhr);
      }
      if (this.rhs != null) {
        paramVarArgs.g(9, this.rhs);
      }
      if (this.rht != null) {
        paramVarArgs.g(10, this.rht);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label744;
      }
    }
    label744:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rfe) + f.a.a.a.fQ(3, this.rhm);
      paramInt = i;
      if (this.rhn != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rhn);
      }
      i = paramInt;
      if (this.rho != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rho);
      }
      paramInt = i;
      if (this.rhp != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rhp);
      }
      i = paramInt;
      if (this.rhq != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rhq);
      }
      paramInt = i;
      if (this.rhr != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rhr);
      }
      i = paramInt;
      if (this.rhs != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rhs);
      }
      paramInt = i;
      if (this.rht != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rht);
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
        he localhe = (he)paramVarArgs[1];
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
            localhe.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localhe.rfe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localhe.rhm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localhe.rhn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localhe.rho = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localhe.rhp = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localhe.rhq = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localhe.rhr = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localhe.rhs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localhe.rht = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/he.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */