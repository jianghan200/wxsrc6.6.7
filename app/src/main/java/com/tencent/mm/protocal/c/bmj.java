package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bmj
  extends bhp
{
  public String cad;
  public String dxh;
  public int end_time;
  public String huU;
  public String huW;
  public String huX;
  public String huY;
  public int hwF;
  public String hwh;
  public int mXk;
  public int mXn;
  public String mXo;
  public String mXp;
  public String mXq;
  public String mXr;
  public String mXs;
  public boolean mXt;
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.hwF);
      if (this.huU != null) {
        paramVarArgs.g(3, this.huU);
      }
      if (this.cad != null) {
        paramVarArgs.g(4, this.cad);
      }
      if (this.title != null) {
        paramVarArgs.g(5, this.title);
      }
      if (this.huX != null) {
        paramVarArgs.g(6, this.huX);
      }
      if (this.huY != null) {
        paramVarArgs.g(7, this.huY);
      }
      if (this.hwh != null) {
        paramVarArgs.g(8, this.hwh);
      }
      if (this.huW != null) {
        paramVarArgs.g(9, this.huW);
      }
      if (this.dxh != null) {
        paramVarArgs.g(10, this.dxh);
      }
      paramVarArgs.fT(11, this.mXk);
      paramVarArgs.fT(12, this.mXn);
      if (this.mXo != null) {
        paramVarArgs.g(13, this.mXo);
      }
      if (this.mXp != null) {
        paramVarArgs.g(14, this.mXp);
      }
      if (this.mXq != null) {
        paramVarArgs.g(19, this.mXq);
      }
      if (this.mXr != null) {
        paramVarArgs.g(21, this.mXr);
      }
      paramVarArgs.fT(22, this.end_time);
      if (this.mXs != null) {
        paramVarArgs.g(23, this.mXs);
      }
      paramVarArgs.av(24, this.mXt);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1256;
      }
    }
    label1256:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwF);
      paramInt = i;
      if (this.huU != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.huU);
      }
      i = paramInt;
      if (this.cad != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.cad);
      }
      paramInt = i;
      if (this.title != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.title);
      }
      i = paramInt;
      if (this.huX != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.huX);
      }
      paramInt = i;
      if (this.huY != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.huY);
      }
      i = paramInt;
      if (this.hwh != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.hwh);
      }
      paramInt = i;
      if (this.huW != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.huW);
      }
      i = paramInt;
      if (this.dxh != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.dxh);
      }
      i = i + f.a.a.a.fQ(11, this.mXk) + f.a.a.a.fQ(12, this.mXn);
      paramInt = i;
      if (this.mXo != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.mXo);
      }
      i = paramInt;
      if (this.mXp != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.mXp);
      }
      paramInt = i;
      if (this.mXq != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.mXq);
      }
      i = paramInt;
      if (this.mXr != null) {
        i = paramInt + f.a.a.b.b.a.h(21, this.mXr);
      }
      i += f.a.a.a.fQ(22, this.end_time);
      paramInt = i;
      if (this.mXs != null) {
        paramInt = i + f.a.a.b.b.a.h(23, this.mXs);
      }
      return paramInt + (f.a.a.b.b.a.ec(24) + 1);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bmj localbmj = (bmj)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        case 20: 
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbmj.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbmj.hwF = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbmj.huU = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbmj.cad = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbmj.title = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbmj.huX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbmj.huY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbmj.hwh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localbmj.huW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localbmj.dxh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          localbmj.mXk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localbmj.mXn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localbmj.mXo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localbmj.mXp = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 19: 
          localbmj.mXq = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 21: 
          localbmj.mXr = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 22: 
          localbmj.end_time = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 23: 
          localbmj.mXs = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbmj.mXt = ((f.a.a.a.a)localObject1).cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bmj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */