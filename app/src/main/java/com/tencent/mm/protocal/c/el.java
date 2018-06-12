package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class el
  extends bhd
{
  public String dkY;
  public String eJK;
  public String hbP;
  public String iwO;
  public String iwP;
  public int qZe;
  public fi reP;
  public String reQ;
  public int reR;
  public String reS;
  public String reT;
  public bhy res;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.res == null) {
        throw new b("Not all required fields were included: AutoAuthKey");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.reP != null)
      {
        paramVarArgs.fV(2, this.reP.boi());
        this.reP.a(paramVarArgs);
      }
      if (this.res != null)
      {
        paramVarArgs.fV(3, this.res.boi());
        this.res.a(paramVarArgs);
      }
      if (this.dkY != null) {
        paramVarArgs.g(4, this.dkY);
      }
      if (this.reQ != null) {
        paramVarArgs.g(5, this.reQ);
      }
      paramVarArgs.fT(6, this.reR);
      if (this.reS != null) {
        paramVarArgs.g(7, this.reS);
      }
      if (this.eJK != null) {
        paramVarArgs.g(8, this.eJK);
      }
      if (this.hbP != null) {
        paramVarArgs.g(9, this.hbP);
      }
      if (this.reT != null) {
        paramVarArgs.g(10, this.reT);
      }
      if (this.iwP != null) {
        paramVarArgs.g(11, this.iwP);
      }
      if (this.iwO != null) {
        paramVarArgs.g(12, this.iwO);
      }
      paramVarArgs.fT(13, this.qZe);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1133;
      }
    }
    label1133:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.reP != null) {
        paramInt = i + f.a.a.a.fS(2, this.reP.boi());
      }
      i = paramInt;
      if (this.res != null) {
        i = paramInt + f.a.a.a.fS(3, this.res.boi());
      }
      paramInt = i;
      if (this.dkY != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.dkY);
      }
      i = paramInt;
      if (this.reQ != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.reQ);
      }
      i += f.a.a.a.fQ(6, this.reR);
      paramInt = i;
      if (this.reS != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.reS);
      }
      i = paramInt;
      if (this.eJK != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.eJK);
      }
      paramInt = i;
      if (this.hbP != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.hbP);
      }
      i = paramInt;
      if (this.reT != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.reT);
      }
      paramInt = i;
      if (this.iwP != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.iwP);
      }
      i = paramInt;
      if (this.iwO != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.iwO);
      }
      return i + f.a.a.a.fQ(13, this.qZe);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.res != null) {
          break;
        }
        throw new b("Not all required fields were included: AutoAuthKey");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        el localel = (el)paramVarArgs[1];
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
            localel.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fi();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fi)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localel.reP = ((fi)localObject1);
            paramInt += 1;
          }
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localel.res = ((bhy)localObject1);
            paramInt += 1;
          }
        case 4: 
          localel.dkY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localel.reQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localel.reR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localel.reS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localel.eJK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localel.hbP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localel.reT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localel.iwP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localel.iwO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localel.qZe = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/el.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */