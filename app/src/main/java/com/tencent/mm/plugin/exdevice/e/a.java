package com.tencent.mm.plugin.exdevice.e;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class a
  extends i
{
  public String hbP;
  public b iwI;
  public int iwJ;
  public int iwK;
  public int iwL;
  public b iwM;
  public b iwN;
  public String iwO;
  public String iwP;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ixi != null)
      {
        paramVarArgs.fV(1, this.ixi.boi());
        this.ixi.a(paramVarArgs);
      }
      if (this.iwI != null) {
        paramVarArgs.b(2, this.iwI);
      }
      paramVarArgs.fT(3, this.iwJ);
      paramVarArgs.fT(4, this.iwK);
      paramVarArgs.fT(5, this.iwL);
      if (this.iwM != null) {
        paramVarArgs.b(6, this.iwM);
      }
      if (this.iwN != null) {
        paramVarArgs.b(7, this.iwN);
      }
      if (this.iwO != null) {
        paramVarArgs.g(10, this.iwO);
      }
      if (this.iwP != null) {
        paramVarArgs.g(11, this.iwP);
      }
      if (this.hbP != null) {
        paramVarArgs.g(12, this.hbP);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.ixi == null) {
        break label723;
      }
    }
    label723:
    for (paramInt = f.a.a.a.fS(1, this.ixi.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.iwI != null) {
        i = paramInt + f.a.a.a.a(2, this.iwI);
      }
      i = i + f.a.a.a.fQ(3, this.iwJ) + f.a.a.a.fQ(4, this.iwK) + f.a.a.a.fQ(5, this.iwL);
      paramInt = i;
      if (this.iwM != null) {
        paramInt = i + f.a.a.a.a(6, this.iwM);
      }
      i = paramInt;
      if (this.iwN != null) {
        i = paramInt + f.a.a.a.a(7, this.iwN);
      }
      paramInt = i;
      if (this.iwO != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.iwO);
      }
      i = paramInt;
      if (this.iwP != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.iwP);
      }
      paramInt = i;
      if (this.hbP != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.hbP);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = i.a(paramVarArgs); paramInt > 0; paramInt = i.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        a locala = (a)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        case 8: 
        case 9: 
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new d();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((d)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, i.a((f.a.a.a.a)localObject2))) {}
            locala.ixi = ((d)localObject1);
            paramInt += 1;
          }
        case 2: 
          locala.iwI = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 3: 
          locala.iwJ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          locala.iwK = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          locala.iwL = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          locala.iwM = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 7: 
          locala.iwN = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 10: 
          locala.iwO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          locala.iwP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        locala.hbP = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */