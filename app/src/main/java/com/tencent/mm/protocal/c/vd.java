package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class vd
  extends bhd
{
  public String csK;
  public String csL;
  public String ixy;
  public double ryA;
  public String ryw;
  public String ryx;
  public long ryy;
  public double ryz;
  
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
      if (this.ixy != null) {
        paramVarArgs.g(2, this.ixy);
      }
      if (this.csL != null) {
        paramVarArgs.g(3, this.csL);
      }
      if (this.csK != null) {
        paramVarArgs.g(4, this.csK);
      }
      if (this.ryw != null) {
        paramVarArgs.g(5, this.ryw);
      }
      if (this.ryx != null) {
        paramVarArgs.g(6, this.ryx);
      }
      paramVarArgs.T(7, this.ryy);
      paramVarArgs.c(8, this.ryz);
      paramVarArgs.c(9, this.ryA);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label665;
      }
    }
    label665:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.ixy != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.ixy);
      }
      i = paramInt;
      if (this.csL != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.csL);
      }
      paramInt = i;
      if (this.csK != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.csK);
      }
      i = paramInt;
      if (this.ryw != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.ryw);
      }
      paramInt = i;
      if (this.ryx != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.ryx);
      }
      return paramInt + f.a.a.a.S(7, this.ryy) + (f.a.a.b.b.a.ec(8) + 8) + (f.a.a.b.b.a.ec(9) + 8);
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
        vd localvd = (vd)paramVarArgs[1];
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
            localvd.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localvd.ixy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localvd.csL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localvd.csK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localvd.ryw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localvd.ryx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localvd.ryy = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 8: 
          localvd.ryz = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        }
        localvd.ryA = ((f.a.a.a.a)localObject1).vHC.readDouble();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/vd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */