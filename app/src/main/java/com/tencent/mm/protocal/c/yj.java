package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class yj
  extends bhd
{
  public String jQb;
  public String jTB;
  public int otY;
  public int qZe;
  public String rEe;
  public String rEh;
  public String rEi;
  public int rEj;
  public String rEk;
  public String rhq;
  public aw rmQ;
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
      if (this.rEh != null) {
        paramVarArgs.g(12, this.rEh);
      }
      if (this.rEi != null) {
        paramVarArgs.g(13, this.rEi);
      }
      if (this.rmQ != null)
      {
        paramVarArgs.fV(14, this.rmQ.boi());
        this.rmQ.a(paramVarArgs);
      }
      paramVarArgs.fT(15, this.otY);
      paramVarArgs.fT(16, this.rEj);
      if (this.rEk != null) {
        paramVarArgs.g(17, this.rEk);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1219;
      }
    }
    label1219:
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
      i = paramInt;
      if (this.rEh != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.rEh);
      }
      paramInt = i;
      if (this.rEi != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.rEi);
      }
      i = paramInt;
      if (this.rmQ != null) {
        i = paramInt + f.a.a.a.fS(14, this.rmQ.boi());
      }
      i = i + f.a.a.a.fQ(15, this.otY) + f.a.a.a.fQ(16, this.rEj);
      paramInt = i;
      if (this.rEk != null) {
        paramInt = i + f.a.a.b.b.a.h(17, this.rEk);
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
        yj localyj = (yj)paramVarArgs[1];
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
            localyj.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localyj.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localyj.rsw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localyj.rhq = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localyj.rsx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localyj.rsy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localyj.rsz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localyj.rrC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localyj.rEe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localyj.qZe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localyj.jTB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localyj.rEh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localyj.rEi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localyj.rmQ = ((aw)localObject1);
            paramInt += 1;
          }
        case 15: 
          localyj.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          localyj.rEj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localyj.rEk = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/yj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */