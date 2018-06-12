package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class yh
  extends bhd
{
  public String jQb;
  public String jTB;
  public int otY;
  public int qZe;
  public String rEe;
  public String rhq;
  public String rrC;
  public String rsw;
  public String rsx;
  public String rsy;
  public String rsz;
  
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
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      if (this.rsw != null) {
        paramVarArgs.g(3, this.rsw);
      }
      if (this.rhq != null) {
        paramVarArgs.g(4, this.rhq);
      }
      if (this.rsx != null) {
        paramVarArgs.g(5, this.rsx);
      }
      if (this.rsy != null) {
        paramVarArgs.g(6, this.rsy);
      }
      if (this.rsz != null) {
        paramVarArgs.g(7, this.rsz);
      }
      if (this.rrC != null) {
        paramVarArgs.g(8, this.rrC);
      }
      if (this.rEe != null) {
        paramVarArgs.g(9, this.rEe);
      }
      paramVarArgs.fT(10, this.qZe);
      if (this.jTB != null) {
        paramVarArgs.g(11, this.jTB);
      }
      paramVarArgs.fT(12, this.otY);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label858;
      }
    }
    label858:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jQb);
      }
      i = paramInt;
      if (this.rsw != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rsw);
      }
      paramInt = i;
      if (this.rhq != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rhq);
      }
      i = paramInt;
      if (this.rsx != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rsx);
      }
      paramInt = i;
      if (this.rsy != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rsy);
      }
      i = paramInt;
      if (this.rsz != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rsz);
      }
      paramInt = i;
      if (this.rrC != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rrC);
      }
      i = paramInt;
      if (this.rEe != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rEe);
      }
      i += f.a.a.a.fQ(10, this.qZe);
      paramInt = i;
      if (this.jTB != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.jTB);
      }
      return paramInt + f.a.a.a.fQ(12, this.otY);
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
        yh localyh = (yh)paramVarArgs[1];
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
            localyh.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localyh.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localyh.rsw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localyh.rhq = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localyh.rsx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localyh.rsy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localyh.rsz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localyh.rrC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localyh.rEe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localyh.qZe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localyh.jTB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localyh.otY = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/yh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */